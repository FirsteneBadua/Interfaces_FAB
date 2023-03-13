interface PriorityItem extends Priority {}

class Task implements PriorityItem, Comparable<Task>{

	@Override
	public void setPriority(int priority) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Task o) {
		// TODO Auto-generated method stub
		return 0;
	}
    // Task class implementation here
}

class Process implements PriorityItem, Comparable<Process>{

	@Override
	public void setPriority(int priority) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Process o) {
		// TODO Auto-generated method stub
		return 0;
	}
    // Process class implementation here
}