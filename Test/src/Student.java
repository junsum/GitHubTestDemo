
public class Student {
	//read�����¼�����������
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
