public class Rectangle{
	public int width=25;
	public int height=10;
	
	public Rectangle(){
			System.out.println("建立一個25*10的矩形");
	}
	
	public Rectangle(int width, int height){
		if(width>0){
			this.width=width;
		}else
			System.out.println("輸入錯誤");
		if(height>0){
			this.height=height;
		}else
			System.out.println("輸入錯誤");
	}
	public Rectangle(int width,int width){
		return width*width;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public int width = 25;
	public int height = 10;
	
	public Rectangle(){
		System.out.println("建立一個25*10的矩形");
	}
	
	public Rectangle(int length){
		this(length,length);
	}
	public Rectangle(int width,int height){
		if(width>0)
			this.width = width;
		else
			System.out.println("寬度錯誤,設定為25");
		if(height>0)
			this.height=height;
		else	
			System.out.println("高度錯誤,設定為10");
		System.out.println("建立一個"+this.width+"*"+this.height+"的矩形");
	}
	
	public int getArea(){
		return width*height;
	}
	
	public void draw(){
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				System.out.print("* ");
			}
			System.out.println("");
		}

	}*/
}