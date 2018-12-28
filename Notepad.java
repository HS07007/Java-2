import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Notepad extends JFrame implements ActionListener
{
    JTextArea ta;
	JPanel p;
	MenuBar mb;
	Menu m1,m2,m3,m4,m5;
	MenuItem m1i_new,m1i_open,m1i_save,m1i_exit,m1i_save_as,m1i_print;
	MenuItem m2i_undo,m2i_cut,m2i_copy,m2i_paste,m2i_select,m2i_replace,m2i_find,m2i_goto;
	MenuItem m3i_word,m3i_font;
	MenuItem m4i_statusbar;
	MenuItem m5i_help,m5i_about;
	
	Notepad()
	{
		super("Notepad");
		setSize(500,700);
		setVisible(true);
		
		ta=new JTextArea();
		add(BorderLayout.CENTER,ta);
		Font f1=new Font("Times New Roman",Font.BOLD,30);
		
		ta.setBackground(Color.WHITE);
		ta.setForeground(Color.BLACK);
		ta.setFont(f1);
		
		p=new JPanel();
		mb=new MenuBar();
		
		m1=new Menu("File");
		
		m1i_new=new MenuItem("New   ctrl+N");
		m1i_open=new MenuItem("Open   ctrl+O");
		m1i_save=new MenuItem("Save   ctrl+S");
		m1i_save_as=new MenuItem("Save As   ctrl+ALT+S");
		m1i_exit=new MenuItem("Exit   ESC");
		m1i_print=new MenuItem("Print   ctrl+P");
		
		m2=new Menu("EDIT");
		
        m2i_undo=new MenuItem("Undo    ctrl+Z");
		m2i_cut=new MenuItem("Cut      ctrl+x");
		m2i_copy=new MenuItem("Copy    ctrl+C");
		m2i_paste=new MenuItem("Paste  ctrl+V");
		m2i_select=new MenuItem("SelectAll  ctrl+A");
		m2i_replace=new MenuItem("Replace ctrl+H");
		m2i_find=new MenuItem("Find ctrl+F");
		m2i_goto=new MenuItem("Goto ctrl+G");
		
		m3=new Menu("View");
		
		m3i_word=new MenuItem("Word");
		m3i_font=new MenuItem("Font");
		
		m4=new Menu("Statusbar");
		
		m4i_statusbar=new MenuItem("Status");
		
		m5=new Menu("Info");
		
		m5i_help=new MenuItem("Help");
		m5i_about=new MenuItem("About");
		
		m1.add(m1i_new);
		m1.add(m1i_open);
		m1.add(m1i_save);
		m1.add(m1i_save_as);
		m1.add(m1i_exit);
		m1.add(m1i_print);
		
		m2.add(m2i_undo);
		m2.add(m2i_cut);
		m2.add(m2i_copy);
		m2.add(m2i_paste);
		m2.add(m2i_select);
		m2.add(m2i_replace);
		m2.add(m2i_find);
		m2.add(m2i_goto);
		
		m3.add(m3i_word);
		m3.add(m3i_font);
		
		m4.add(m4i_statusbar);
		
		m5.add(m5i_help);
		m5.add(m5i_about);
		
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
		
		setMenuBar(mb);
		
		m1i_new.addActionListener(this);
		m1i_open.addActionListener(this);
		m1i_save.addActionListener(this);
		m1i_exit.addActionListener(this);
		m1i_save_as.addActionListener(this);
		m1i_print.addActionListener(this);
		
		m2i_cut.addActionListener(this);
		m2i_copy.addActionListener(this);
		m2i_paste.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==m1i_new)
		{
			Notepad n=new Notepad();
		}
		if(e.getSource()==m2i_cut)
		{
			ta.cut();
		}
		if(e.getSource()==m2i_copy)
		{
			ta.copy();
		}
		if(e.getSource()==m2i_paste)
		{
			ta.paste();
		}
	}
	public static void main(String args[])
	{
		Notepad n=new Notepad();
		
	}
}  
