package seven;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import seven.wapperInt.Wrapper;
import seven.wapperInt.wapperRef.WrapperObj;

import java.io.FileInputStream;


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
		POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(FilePath));
		return r.init(fs);
	}

}
