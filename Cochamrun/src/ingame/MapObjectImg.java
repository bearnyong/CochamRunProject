/*형통*/
package ingame;

import javax.swing.ImageIcon;

public class MapObjectImg {

	//배경 이미지
	private ImageIcon backIc; //제일 뒷배경
	private ImageIcon secondBackIc; //두번째 배경
	
	//젤리 이미지 아이콘들
	private ImageIcon jelly1Ic;
	private ImageIcon jelly2Ic;
	private ImageIcon jelly3Ic;
	private ImageIcon jellyHPIC;
	
	private ImageIcon jellyEffectIc;
	
	// 발판 이미지 아이콘들
	private ImageIcon fileld1Ic; //발판
	private ImageIcon fileld2Ic; //공중발판
	
	// 장애물 이미지 아이콘들
	private ImageIcon tacle10Ic; // 1칸 장애물
	private ImageIcon tacle20Ic; // 2칸 장애뭉
	private ImageIcon tacle30Ic; // 3칸 장애문
	private ImageIcon tacle40Ic; // 4칸 장애물
	
	public MapObjectImg() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MapObjectImg(ImageIcon backIc, ImageIcon secondBackIc, ImageIcon jelly1Ic, ImageIcon jelly2Ic,
			ImageIcon jelly3Ic, ImageIcon jellyHPIC, ImageIcon jellyEffectIc, ImageIcon fileld1Ic, ImageIcon fileld2Ic,
			ImageIcon tacle10Ic, ImageIcon tacle20Ic, ImageIcon tacle30Ic, ImageIcon tacle40Ic) {
		super();
		this.backIc = backIc;
		this.secondBackIc = secondBackIc;
		this.jelly1Ic = jelly1Ic;
		this.jelly2Ic = jelly2Ic;
		this.jelly3Ic = jelly3Ic;
		this.jellyHPIC = jellyHPIC;
		this.jellyEffectIc = jellyEffectIc;
		this.fileld1Ic = fileld1Ic;
		this.fileld2Ic = fileld2Ic;
		this.tacle10Ic = tacle10Ic;
		this.tacle20Ic = tacle20Ic;
		this.tacle30Ic = tacle30Ic;
		this.tacle40Ic = tacle40Ic;
	}



	public ImageIcon getBackIc() {
		return backIc;
	}

	public void setBackIc(ImageIcon backIc) {
		this.backIc = backIc;
	}

	public ImageIcon getSecondBackIc() {
		return secondBackIc;
	}

	public void setSecondBackIc(ImageIcon secondBackIc) {
		this.secondBackIc = secondBackIc;
	}

	public ImageIcon getJelly1Ic() {
		return jelly1Ic;
	}

	public void setJelly1Ic(ImageIcon jelly1Ic) {
		this.jelly1Ic = jelly1Ic;
	}

	public ImageIcon getJelly2Ic() {
		return jelly2Ic;
	}

	public void setJelly2Ic(ImageIcon jelly2Ic) {
		this.jelly2Ic = jelly2Ic;
	}

	public ImageIcon getJelly3Ic() {
		return jelly3Ic;
	}

	public void setJelly3Ic(ImageIcon jelly3Ic) {
		this.jelly3Ic = jelly3Ic;
	}

	public ImageIcon getJellyHPIC() {
		return jellyHPIC;
	}

	public void setJellyHPIC(ImageIcon jellyHPIC) {
		this.jellyHPIC = jellyHPIC;
	}

	public ImageIcon getJellyEffectIc() {
		return jellyEffectIc;
	}

	public void setJellyEffectIc(ImageIcon jellyEffectIc) {
		this.jellyEffectIc = jellyEffectIc;
	}

	public ImageIcon getFileld1Ic() {
		return fileld1Ic;
	}

	public void setFileld1Ic(ImageIcon fileld1Ic) {
		this.fileld1Ic = fileld1Ic;
	}

	public ImageIcon getFileld2Ic() {
		return fileld2Ic;
	}

	public void setFileld2Ic(ImageIcon fileld2Ic) {
		this.fileld2Ic = fileld2Ic;
	}

	public ImageIcon getTacle10Ic() {
		return tacle10Ic;
	}

	public void setTacle10Ic(ImageIcon tacle10Ic) {
		this.tacle10Ic = tacle10Ic;
	}

	public ImageIcon getTacle20Ic() {
		return tacle20Ic;
	}

	public void setTacle20Ic(ImageIcon tacle20Ic) {
		this.tacle20Ic = tacle20Ic;
	}

	public ImageIcon getTacle30Ic() {
		return tacle30Ic;
	}

	public void setTacle30Ic(ImageIcon tacle30Ic) {
		this.tacle30Ic = tacle30Ic;
	}

	public ImageIcon getTacle40Ic() {
		return tacle40Ic;
	}

	public void setTacle40Ic(ImageIcon tacle40Ic) {
		this.tacle40Ic = tacle40Ic;
	}

	@Override
	public String toString() {
		return "MapObjectimg []";
	}
	
	
	
	
	
}
