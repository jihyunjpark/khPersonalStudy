package kh.collection;

public class CustomVector {

	private Object[] objArr = new Object[10];
	private int size;

	public CustomVector() {
		Object[] objArr = new Object[10];
	}

	public CustomVector(int capacity) {
		objArr = new Object[capacity];
	}

	public int capacity() {
		return objArr.length;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		boolean result = true;
		for (int i = 0; i < objArr.length; i++) {
			if (objArr[i] != null) {
				result = false;
				break;
			}
		}
		return result;
	}

	public void add(Object i) {
		Object[] temp = null;
		if (size() == capacity()) {
			temp = objArr;
			objArr = new Object[temp.length * 2];
			for (int n = 0; n < temp.length; n++) {
				objArr[n] = temp[n];
			}
		}
		objArr[size] = i;
		size++;
	}

	public Object get(int index) {
		if (index < 0 || size <= index) {
			throw new IndexOutOfBoundsException();
		}
		return objArr[index];
	}

	public int indexOf(Object obj) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (objArr[i].equals(obj)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public boolean remove(Object obj) {
		boolean result = false;
		int index = indexOf(obj);
		if (index != -1) {
			objArr[index] = null;
			System.arraycopy(objArr, index + 1, objArr, index, size - index - 1);
			objArr[size - 1] = null;
			size--;
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < objArr.length; i++) {
			if (objArr[i] != null) {
				result += objArr[i] + " ";
			}
		}
		return result;
	}

}
