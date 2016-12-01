package seven.savewapper;
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

import seven.ExcelSuperInterface;
import seven.callBack.DataFilterColumnInterface;
import seven.callBack.DataFilterInterface;
import seven.callBack.DataFilterProcessInterface;

import java.util.Comparator;

/**
 * [Zhihu]https://www.zhihu.com/people/Sweets07
 * [Github]https://github.com/MatrixSeven
 * Created by seven on 2016/11/30.
 */
public interface SaveExcel extends ExcelSuperInterface {

    void Save() throws Exception;
    /**
     * ��Ҫ��װ�����ݽ��й��ˣ���Ӧʵ��Bean\n
     * �������false��������������
     * @param filter {@link DataFilterInterface}
     * @return
     */
    public abstract SaveExcel Filter(DataFilterInterface<?> filter);

    /**
     *�˴�����ÿһ�д���õ����ݡ���Ӧһ��ʵ��\n
     * ��process������ɶ����Խ��д���ӹ�
     * @param process {@link DataFilterProcessInterface}
     * @return
     */
    public abstract SaveExcel Process(DataFilterProcessInterface<?> process);

    /**
     *	�Խ����List��������
     * @param c
     * @return
     */
    public abstract SaveExcel Sort(Comparator<? super Object> c);

    /**
     * �˴�����Excel�������ݣ�������\n
     * �������󣬽�����ʵ����и�ֵ
     * @param df {@link DataFilterColumnInterface}
     */
    public abstract SaveExcel FilterCol(DataFilterColumnInterface df);


}
