import java.util.*;
class CPU
{
	int price;
	public CPU(int price)
	{
		this.price=price;
	}
	void display_cpu()
	{
		System.out.println("CPU price:"+price);
	}
	class Processor
	{
		int cores;
		String manufacturer;
		Processor(int cores,String manufacturer)
		{
			this.cores=cores;
			this.manufacturer=manufacturer;
		}
		void display_processor()
		{
		          System.out.println("PROCESSOR INFORMATION:");
			System.out.println("No of cores:"+cores);
			System.out.println("Manufacturer:"+manufacturer);
		}
	}
	static class RAM
	{
		int memory;
		String manufacturer_ram;
		RAM(int memory,String manufacturer_ram)
		{
			this.memory=memory;
			this.manufacturer_ram=manufacturer_ram;
		}
		void display_ram()
		{
			System.out.println("Memory:"+memory);
			System.out.println("Manufacturer:"+manufacturer_ram);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price of cpu:");
		int price=sc.nextInt();
		CPU cpu=new CPU(price);
		
		System.out.println("Enter the no of cores:");
		int cores=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter manufacturer:");
		String manufacturer=sc.nextLine();
		
		CPU.Processor p=cpu.new Processor(cores,manufacturer);
		System.out.println("Enter memory:");
		int memory=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter manufacturer:");
		String manufacturer_ram=sc.nextLine();
		 
		CPU.RAM ram=new CPU.RAM(memory,manufacturer_ram);
		p.display_processor();
		ram.display_ram();
		cpu.display_cpu();
	}
}
