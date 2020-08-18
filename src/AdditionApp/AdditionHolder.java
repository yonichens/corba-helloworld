package AdditionApp;

/**
* AdditionApp/AdditionHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Addition.idl
* 2020年8月18日 星期二 上午10时05分55秒 CST
*/

public final class AdditionHolder implements org.omg.CORBA.portable.Streamable
{
  public AdditionApp.Addition value = null;

  public AdditionHolder ()
  {
  }

  public AdditionHolder (AdditionApp.Addition initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AdditionApp.AdditionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AdditionApp.AdditionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AdditionApp.AdditionHelper.type ();
  }

}
