package co.kr.board.VO;

public class BoardVO {

	private int board_no;
	private int user_no;
	private String user_nick;
	private String board_title;
	private String board_content;
	private String board_day;
	private int board_view;
	private String board_type;

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getUser_nick() {
		return user_nick;
	}

	public void setUser_nick(String user_nick) {
		this.user_nick = user_nick;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public String getBoard_day() {
		return board_day;
	}

	public void setBoard_day(String board_day) {
		this.board_day = board_day;
	}

	public int getBoard_view() {
		return board_view;
	}

	public void setBoard_view(int board_view) {
		this.board_view = board_view;
	}

	public String getBoard_type() {
		return board_type;
	}

	public void setBoard_type(String board_type) {
		this.board_type = board_type;
	}

	public BoardVO(int board_no, int user_no, String user_nick, String board_title, String board_content,
			String board_day, int board_view, String board_type) {
		super();
		this.board_no = board_no;
		this.user_no = user_no;
		this.user_nick = user_nick;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_day = board_day;
		this.board_view = board_view;
		this.board_type = board_type;
	}

	public BoardVO() {
		super();
	}

}
