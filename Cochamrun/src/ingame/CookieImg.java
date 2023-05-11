/*지환*/
package ingame;

//import java.awt.image;
import javax.swing.ImageIcon;

public class CookieImg {
	private ImageIcon cookieIc; // 기본모션
	private ImageIcon jumpIc; // 점프모션
	private ImageIcon doubleJumpIc; // 더블점프모션
	private ImageIcon fallIC; // 낙하모션(더블 점프후)
	private ImageIcon slideIc; // 슬라이드 모션
	private ImageIcon hitIc; // 부딪히는 모션
	
	
	public CookieImg() {
		
	}


	public CookieImg(ImageIcon cookieIc, ImageIcon jumpIc, ImageIcon doubleJumpIc, ImageIcon fallIC, ImageIcon slideIc,
			ImageIcon hitIc) {
		this.cookieIc = cookieIc;
		this.jumpIc = jumpIc;
		this.doubleJumpIc = doubleJumpIc;
		this.fallIC = fallIC;
		this.slideIc = slideIc;
		this.hitIc = hitIc;
	}


	public ImageIcon getCookieIc() {
		return cookieIc;
	}


	public void setCookieIc(ImageIcon cookieIc) {
		this.cookieIc = cookieIc;
	}


	public ImageIcon getJumpIc() {
		return jumpIc;
	}


	public void setJumpIc(ImageIcon jumpIc) {
		this.jumpIc = jumpIc;
	}


	public ImageIcon getDoubleJumpIc() {
		return doubleJumpIc;
	}


	public void setDoubleJumpIc(ImageIcon doubleJumpIc) {
		this.doubleJumpIc = doubleJumpIc;
	}


	public ImageIcon getFallIC() {
		return fallIC;
	}


	public void setFallIC(ImageIcon fallIC) {
		this.fallIC = fallIC;
	}


	public ImageIcon getSlideIc() {
		return slideIc;
	}


	public void setSlideIc(ImageIcon slideIc) {
		this.slideIc = slideIc;
	}


	public ImageIcon getHitIc() {
		return hitIc;
	}


	public void setHitIc(ImageIcon hitIc) {
		this.hitIc = hitIc;
	}
	
	
}
