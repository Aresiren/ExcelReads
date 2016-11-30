package seven;

import seven.savewapper.SaveExcel;
import seven.savewapper.wapperRef.sysWppers.ResExprotMap;
import seven.savewapper.wapperRef.sysWppers.ResExprotObj;
import seven.wapperInt.Wrapper;
import seven.wapperInt.wapperRef.WrapperObj;

import java.util.List;
import java.util.Map;


//=======================================================
//		          .----.
//		       _.'__    `.
//		   .--(^)(^^)---/#\
//		 .' @          /###\
//		 :         ,   #####
//		  `-..__.-' _.-\###/
//		        `;_:    `"'
//		      .'"""""`.
//		     /,  ya ,\\
//		    //������  \\
//		    `-._______.-'
//		    ___`. | .'___
//		   (______|______)
//=======================================================
/**
 * @author Seven<p>
 * @date   2016��6��4��-����4:08:19
 */
@SuppressWarnings("unchecked")
public class ExcelFactory {

	private ExcelFactory() {
	}

	public static Wrapper getBeans(String FilePath, WrapperObj r) throws Exception {
		return (Wrapper)r.init(FilePath);
	}
	public static SaveExcel saveExcel(List<? extends Object> bean, String FilePath) throws Exception {
            if (bean.size() < 1) {
                throw new Exception("�봫������");
            }
            if (bean.get(0) instanceof Map) {
               return new ResExprotMap((List<Map>) bean,FilePath);
            }
         return new ResExprotObj((List)bean, FilePath);
	}

}
