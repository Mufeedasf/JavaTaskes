class Atm
{
String bankName="Ujivan";
String[] branch;
String[] acs;
String[] cctvBrands;
 
   
 
void setBranch(String[] branch)
{
	this.branch=branch;
}
void setAcs(String[] acs)
{
	this.acs=acs;
}
void setCctvBrand(String[] cctvBrands)
{
	this.cctvBrands=cctvBrands;
}

void show()
{
	System.out.println("Showing Information..");
    
	
	
	if(this.branch!=null)
	{
		for(int i=0;i<this.branch.length;i++)
		{
			 String ref=this.branch[i];
			System.out.println("branch is at:"+ref);
			
		}
	}
	System.out.println("bankName: "+this.bankName);
 if(this.acs!=null)
	{
		for(int j=0;j<this.acs.length;j++)
		{
			 String val=this.branch[j];
			System.out.println("branch is at:"+val);
			
		}
	}
	System.out.println("branch:"+this.branch);
if(this.cctvBrands!=null)
	{
		for(int k=0;k<this.cctvBrands.length;k++)
		{
			 String val1=this.branch[k];
			System.out.println("branch is at:"+val1);
			
		}
		
	}	
	System.out.println("Ending Information");
	
}
}
	

