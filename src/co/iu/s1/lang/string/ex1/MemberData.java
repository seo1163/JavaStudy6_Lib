package co.iu.s1.lang.string.ex1;

public class MemberData {

	private String data;
	
	//기본생성자 선언
	public MemberData() {
		this.data="id1-pw1-name1-id1@gamil.com-20-";
		this.data=this.data+"id2-pw2-name2-name2@naver.com-42-";
		this.data=this.data+"id3-pw3-name3-name3@daum.net-36-";
		this.data = this.data+"id4-pw4-name4-name4@gmail.com-52-";
		System.out.println(this.data);
	}
	
	public MemberDTO [] init() {
		//this.data
		String [] datas = this.data.split("-");
		
		MemberDTO [] members = new MemberDTO[4];
		
		int index=0;
		
		for(int i=0;i<members.length;i++) {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(datas[index]);	//datas[0] 4  8
		memberDTO.setPw(datas[++index]);	//datas[1] 5  9
		memberDTO.setName(datas[++index]);	//datas[2] 6  10
		memberDTO.setEmail(datas[++index]);	//datas[3] 7  11
		memberDTO.setAge(datas[++index]);
		members[i]=memberDTO;
		index++;
		}
		
		return members;
	}
	}
	

