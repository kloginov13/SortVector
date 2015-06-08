public class SortedVector implements ISortedVector {

    private Comparable[] _array;
    private int _length;
    private int _capacity;///
    public SortedVector(){
            _length = 1;
            _capacity = -1;///
            _array = new Comparable[_length];
        }

    public void show(){
        for(int i =0 ; i < _length; i++)
        {
            System.out.print(_array[i].getClass().getName());
            System.out.println(_array[i]);
        }
    }

    public void add(Comparable o) {
        if(_capacity+1 == _length){///
            _length += 2;
            Comparable[] tmpArray = _array.clone();
            _array = new Comparable[_length];
            System.arraycopy(tmpArray, 0, _array, 0, tmpArray.length);
        }
        for(int i = 0; i <= _capacity; i++){///
            if(o.compareTo(_array[i]) < 0){
                Comparable[] tmpArray = _array.clone();
                _array[i] = o;
                System.arraycopy(tmpArray, i, _array, i + 1, _length - i-1 );
                _length = _array.length;
                _capacity++;///
                return;
            }
        }
        _capacity++;///
        _array[_capacity] = o;///
    }

    public void remove(int index) {
        if(index < 0 || index > _capacity)///
            return;
        Comparable[] tmpArray = _array.clone();
        System.arraycopy(tmpArray, 0, _array, 0, index);
        System.arraycopy(tmpArray, index+1, _array, index, _length-index-1);
        _array[_capacity] = null;///
        _capacity--;///
    }

    public Comparable get(int index) {
        if(index < 0 || index > _capacity)///
            return null;
        return _array[index];
    }

    public int indexOf(Comparable o) {
        for(int i = 0; i < _length; i++){
            if(o.equals(_array[i])){
                return i;
            }
        }
        return -1;
    }
}

