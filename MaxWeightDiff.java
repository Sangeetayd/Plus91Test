class MaxWeightDiff {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++) {
int[] arr=sc.nextInt();
}
for(int i=0;i<t;i++) {
System.out.println("arr[]=  "+arr[i]);
}
int k=sc.nextInt();
System.out.println("k= "+k);

for(int i=0;i<t;i++) {
for(int j=i+1;j<t;j++) {
if(arr[i]<arr[j]) 
{
System.out.println(" "+arr[i]);
}
}
}
int min=arr[0];
int secMin=arr[1];
int diff=difference();
System.out.println("Maximum Weight Difference is= "+diff);
}
public int difference() {
int sum=0;
for(int i=2;i<t;i++) {
sum=sum+arr[i];
}
diff=sum-(min+secMin);
return diff;
}
}