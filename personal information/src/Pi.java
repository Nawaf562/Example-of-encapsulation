
public class Pi {
	
    String Username ; 
    private int Password;                    //private variable
    private  String Email;                   //private variable
    private String Phonenumber;              //private variable
    private String Retrievalemail;           //private variable
   

   Pi(){
	   
}
   Pi(String newuser , int newpass , String neweemail , String newpn , String newre){                   
		
	   Username = newuser;
	   Password = newpass;
	   Email = neweemail;
	   Phonenumber = newpn;
	   Retrievalemail = newre ;
   }
	  
		public void setpass(int newpass){  //Setter

		  this.Password = newpass;

		}
		  public void setemail(String neweemail){  //Setter

			  this.Email = neweemail;

		}	
		public void setpn(String newpn){  //Setter

		  this.Phonenumber = newpn;

	
		}
		public void setre(String newre){  //Setter

			  this.Retrievalemail = newre;
		}
//-------------------------------------------------------------------------------------		
		
		public int getpass(){             //Getter
			 
			 return Password;
		}
		public String getemail(){             //Getter
			 
			 return Email;
		}
		public String getpn(){             //Getter
			 
			 return Phonenumber;
		}
		public String getre(){             //Getter
			 
			 return Retrievalemail;
		}
		
}


