package Project1;

public class Project_1 {
	public static void main(String args[]){
       String s[][]={{"Emp No","Emp Name","Join Date","Designation Code","Department","Basic","HRA","IT"},
            {"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
            {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
            {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
            {"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
            {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
            {"1006","Suman","01/01/2009","e","Manufacturing","23000","9000","4400"},
            {"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}
        };
int i,j,f=0,salary=0;
String o="",name="",dept="";
for(i=0;i<s.length;i++){
        if(args[0].equals(s[i][0])){
            f=1;
            name=s[i][1];
            dept=s[i][4];
            salary=salary+Integer.parseInt(s[i][5])+Integer.parseInt(s[i][6])-Integer.parseInt(s[i][7]);
            //-Integer.parseInt(s[i][7]);
            o=s[i][3];
            break;
        }
}
//System.out.println(salary);

String da[][]={{"Designation code","Designation","DA"},
                {"e","Engineer","20000"},
                {"c","consultant","32000"},
                {"k","Clerk","12000"},
                {"r","Receptionist","15000"},
                {"m","Manager","40000"}};
String r[][]={{"Emp no","Emp Name","Department","Designation","Salary"},
                {"","","","",""}};

if(f==0)
System.out.println("There is no Employee with empid:"+args[0]);


for(i=1;i<da.length;i++){
    if(da[i][0].equals(o)){
        salary=salary+Integer.parseInt(da[i][2]);
        r[1][0]=args[0];
        r[1][1]=name;
        r[1][2]=dept;
        r[1][3]=da[i][1];
        r[1][4]=Integer.toString(salary);

        break;
    }
}


for(i=0;i<r.length;i++){
    for(j=0;j<r[i].length;j++){
        System.out.print(r[i][j]+" ");
    }
    System.out.println();
}

		
				
		}
}
