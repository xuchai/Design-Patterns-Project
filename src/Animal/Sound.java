package Animal;

public interface Sound {
	public String sound();
}

class Silence implements Sound{
	public String sound(){
		
		return "....(no sound)";
	}
}

class Tweet implements Sound{
	public String sound(){
		
		return "tweet";
	}
}

class Woof implements Sound{
	public String sound(){
		
		return "woof";
	}
}

class Meow implements Sound{
	public String sound(){
		
		return "meow";
	}
}

class Owowow implements Sound{
	public String sound(){
		
		return "ow ow ow";
	}
}

