package Statistics;

public class Regression_line_value_a_b {
	 public static void main(String[] args) {
	int xi[]= {2,5,9,13};
	int yi[]= {7,10,17,30};
	double xi_sum=0,yi_sum=0,p,q,r=0,sum_r=0,s=0;
	for(int i=0;i<xi.length;i++) {
		xi_sum+=xi[i];
		yi_sum+=yi[i];	
	}
	double xbar=xi_sum/xi.length;
	double ybar=yi_sum/yi.length;
	//System.out.println(+xbar);
	//System.out.println(+ybar);
	
	//xi-xbar=p,yi-ybar=q,(xi-xbar)2=r:
	for(int i=0;i<xi.length;i++) {
		p=xi[i]-xbar;
		//System.out.println(+p);//xi-xbar	
	    q=yi[i]-ybar;
	    //System.out.println(+q);//yi-ybar	  
	    r+=(xi[i]-xbar)*(xi[i]-xbar);
	   // System.out.println(+r);//(sum_xi-xbar)2  
	    s+=(xi[i]-xbar)*(yi[i]-ybar);
	    //System.out.println(+s);//(sum_xi-xbar*yi-ybar)
	}
	double b= s/r;
	double a=ybar-b*xbar;
	System.out.println("Value of a: "+a);
	System.out.println("Value of b: "+b);
	
	
	 }
}
