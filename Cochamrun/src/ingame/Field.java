/*민영*/
package ingame;

public class Field {
	
	/*발판 이미지*/
	private Image image;
	
	/*발판의 좌표, 넓이, 높이*/
	private int x;  //좌표값 x
	private int y;  //좌표값 y
	private int width;  //발판의 넓이
	private int height; //발판의 높이
	
	public Field(Image image, int x, int y, int width, int height) {
		super();
		this.image = image;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Field() {
		super();
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
