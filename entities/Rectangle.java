package cursoJavaUdemy.entities;

public class Rectangle {
	
	private Double width;
	private Double height;
	
	public Double area() {
		return (this.height*this.width);
	}
	public Double perimeter() {
		return ((this.height*2)+(this.width*2));
	}
	public Double diagonal() {
		return Math.sqrt(Math.pow(this.height, 2)+Math.pow(this.width, 2));
	}
	public Rectangle() {
		
	}
	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}

}
