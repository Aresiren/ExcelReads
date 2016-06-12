package seven.wapperInt.wapperRef;

import java.util.List;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import seven.wapperInt.Wapper;

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
 * @date   2016��4��12��-����4:07:57
 */
public abstract class WapperObj<T> extends Wapper{
	public abstract List<T> RefResWapper(POIFSFileSystem fs) throws Exception;
}
