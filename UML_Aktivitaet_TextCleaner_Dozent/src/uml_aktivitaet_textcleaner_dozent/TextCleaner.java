package uml_aktivitaet_textcleaner_dozent;

public class TextCleaner {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public TextCleaner(String text) {
		this.setText(text);
	}
	
	public TextCleaner() {
		
	}

	@Override
	public String toString() {
		return "TextCleaner [getText()=" + getText() + "]";
	}
	
	public String entferneLeerzeichen(String text) {
		text = text.trim();
		text = text.replaceAll("[ ]+", " ");
		return text;
	}
	
	public String beginnGross(String text) {
		text = text.replaceFirst(text.substring(0, 1), text.substring(0, 1).toUpperCase());
		return text;
	}
	
	public String beendeMitPunkt(String text) {
		text = text + ".";
		return text;
	}
	
	public String textSaeubern() {
		if(this.getText() != null) {
			this.setText(this.entferneLeerzeichen(this.getText()));
			this.setText(this.beginnGross(this.getText()));
			this.setText(this.beendeMitPunkt(this.getText()));
		}
		return this.getText();
	}
	
	public String textSaeubern(String text) {
		this.setText(text);
		this.textSaeubern();
		return this.getText();
	}
}
