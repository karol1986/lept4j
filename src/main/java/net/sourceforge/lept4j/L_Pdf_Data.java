package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * Intermediate pdf generation data<br>
 * <i>native declaration : imageio.h:113</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Pdf_Data extends Structure {
	/**
	 * optional title for pdf<br>
	 * C type : char*
	 */
	public Pointer title;
	/**
	 * number of images<br>
	 * C type : l_int32
	 */
	public int n;
	/**
	 * number of colormaps<br>
	 * C type : l_int32
	 */
	public int ncmap;
	/**
	 * array of compressed image data<br>
	 * C type : L_Ptra*
	 */
	public net.sourceforge.lept4j.L_Ptra.ByReference cida;
	/**
	 * %PDF-1.2 id string<br>
	 * C type : char*
	 */
	public Pointer id;
	/**
	 * catalog string<br>
	 * C type : char*
	 */
	public Pointer obj1;
	/**
	 * metadata string<br>
	 * C type : char*
	 */
	public Pointer obj2;
	/**
	 * pages string<br>
	 * C type : char*
	 */
	public Pointer obj3;
	/**
	 * page string (variable data)<br>
	 * C type : char*
	 */
	public Pointer obj4;
	/**
	 * content string (variable data)<br>
	 * C type : char*
	 */
	public Pointer obj5;
	/**
	 * post-binary-stream string<br>
	 * C type : char*
	 */
	public Pointer poststream;
	/**
	 * trailer string (variable data)<br>
	 * C type : char*
	 */
	public Pointer trailer;
	/**
	 * store (xpt, ypt) array<br>
	 * C type : Pta*
	 */
	public net.sourceforge.lept4j.Pta.ByReference xy;
	/**
	 * store (wpt, hpt) array<br>
	 * C type : Pta*
	 */
	public net.sourceforge.lept4j.Pta.ByReference wh;
	/**
	 * bounding region for all images<br>
	 * C type : Box*
	 */
	public net.sourceforge.lept4j.Box.ByReference mediabox;
	/**
	 * pre-binary-stream xobject strings<br>
	 * C type : Sarray*
	 */
	public net.sourceforge.lept4j.Sarray.ByReference saprex;
	/**
	 * colormap pdf object strings<br>
	 * C type : Sarray*
	 */
	public net.sourceforge.lept4j.Sarray.ByReference sacmap;
	/**
	 * sizes of each pdf string object<br>
	 * C type : L_Dna*
	 */
	public net.sourceforge.lept4j.L_Dna.ByReference objsize;
	/**
	 * location of each pdf string object<br>
	 * C type : L_Dna*
	 */
	public net.sourceforge.lept4j.L_Dna.ByReference objloc;
	/**
	 * location of xref<br>
	 * C type : l_int32
	 */
	public int xrefloc;
	public L_Pdf_Data() {
		super();
	}
	/**
	 * Gets this Structure's field names in their proper order.
	 * @return list of ordered field names
	 */
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("title", "n", "ncmap", "cida", "id", "obj1", "obj2", "obj3", "obj4", "obj5", "poststream", "trailer", "xy", "wh", "mediabox", "saprex", "sacmap", "objsize", "objloc", "xrefloc");
	}
	public L_Pdf_Data(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends L_Pdf_Data implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Pdf_Data implements Structure.ByValue {
		
	};
}
