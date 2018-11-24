
public class Student {
	//read方法事件监听器引用
private Listener listener;

public void setReadListener(Listener listener)
{
	this.listener=listener;
}
public void read()
{
	if(listener!=null)
	{
		Event event=new Event();
		event.setStudent(this);
		listener.isReading(event);
	}
}

}
