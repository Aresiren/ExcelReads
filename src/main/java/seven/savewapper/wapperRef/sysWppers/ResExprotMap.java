package seven.savewapper.wapperRef.sysWppers;
//=======================================================
//		          .----.
//		       _.'__    `.
//		   .--(^)(^^)---/!\
//		 .' @          /!!!\
//		 :         ,    !!!!
//		  `-..__.-' _.-\!!!/
//		        `;_:    `"'
//		      .'"""""`.
//		     /,  ya ,\\
//		    //������\\
//		    `-._______.-'
//		    ___`. | .'___
//		   (______|______)
//=======================================================

import org.apache.poi.ss.usermodel.*;
import seven.savewapper.wapperRef.SaveExcelObject;
import seven.util.ExcelTool;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.util.*;

/**
 * [Zhihu]https://www.zhihu.com/people/Sweets07
 * [Github]https://github.com/MatrixSeven
 * Created by seven on 2016/11/30.
 */
public class ResExprotMap extends SaveExcelObject<Map> {
    public ResExprotMap(List<Map> list, String path) {
        super(list, path);
    }

    public ResExprotMap(ResultSet resultSet, String path) {
        super(resultSet, path);
    }



    @Override
    public void Save() throws Exception {
        Workbook wk = ExcelTool.newInstance(path, true);
        OutputStream out = new FileOutputStream(path);
        if (c != null) {
            list.sort(c);
        }
        Sheet sheet = wk.createSheet("sheet1");
        sheet.setDefaultColumnWidth((short) 15);
        // ����һ����ʽ
        CellStyle style = wk.createCellStyle();
        // ������Щ��ʽ
//        style.setFillPattern(FillPatternType.ALT_BARS);
//        style.setBorderBottom(BorderStyle.THIN);
//        style.setBorderLeft(BorderStyle.THIN);
//        style.setBorderRight(BorderStyle.THIN);
//        style.setBorderTop(BorderStyle.THIN);
        style.setAlignment(HorizontalAlignment.CENTER);
        Map m = list.get(0);
        Set<String> set_title = m.keySet();
        Iterator<String> it = set_title.iterator();
        String t;
        String[] title;
        List<String> l;
        l = new ArrayList();
        while (it.hasNext()) {
            t = it.next();
            if (!filterColBy_key.contains(t)) {
                l.add(t);
            }
        }
        title = l.toArray(new String[l.size()]);

        Row row = sheet.createRow(0);
        for (short i = 0; i < title.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellStyle(style);
            cell.setCellValue(title[i]);
        }
        int index = 0;
        for (Map<String, String> o : list) {
            if (!filter.filter(o).booleanValue()) {
                continue;
            }
            row = sheet.createRow(++index);
            process.process(o);//�ӹ�ÿһ��
            for (int i = 0; i < title.length; i++) {
                Cell cell = row.createCell(i);
                cell.setCellStyle(style);
                cell.setCellValue(o.get(title[i]));
            }
        }
        try {
            wk.write(out);

        } finally {
            wk.close();
            out.close();
        }
    }
}
