class Looping 
{

public static void main(String[] args) {

int ctr=0;
for(int i=0;i<10;i++)
{
//i-0 .. c-3 j-4
for(int j=0;j<4;j++){

if(j==3)
continue;
ctr++;
}
ctr++;//10
}

System.out.println(ctr);
}
}