package com.example.recyclerbinding.databinding;
import com.example.recyclerbinding.R;
import com.example.recyclerbinding.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySecondBindingImpl extends ActivitySecondBinding implements com.example.recyclerbinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textViewId, 7);
        sViewsWithIds.put(R.id.textViewTitle, 8);
        sViewsWithIds.put(R.id.textViewAuthor, 9);
        sViewsWithIds.put(R.id.textViewDescription, 10);
        sViewsWithIds.put(R.id.textViewPublishDate, 11);
        sViewsWithIds.put(R.id.buttonDelete, 12);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editAuthorandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addBook.author.getValue()
            //         is addBook.author.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editAuthor);
            // localize variables for thread safety
            // addBook.author
            androidx.lifecycle.MutableLiveData<java.lang.String> addBookAuthor = null;
            // addBook != null
            boolean addBookJavaLangObjectNull = false;
            // addBook.author != null
            boolean addBookAuthorJavaLangObjectNull = false;
            // addBook.author.getValue()
            java.lang.String addBookAuthorGetValue = null;
            // addBook
            com.example.recyclerbinding.BookAddViewModel addBook = mAddBook;



            addBookJavaLangObjectNull = (addBook) != (null);
            if (addBookJavaLangObjectNull) {


                addBookAuthor = addBook.author;

                addBookAuthorJavaLangObjectNull = (addBookAuthor) != (null);
                if (addBookAuthorJavaLangObjectNull) {




                    addBookAuthor.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editBookIdandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addBook.id.getValue()
            //         is addBook.id.setValue((java.lang.Integer) callbackArg_0)
            int callbackArg_0 = com.example.recyclerbinding.AdapterToString.getIntegerFromBinding(editBookId);
            // localize variables for thread safety
            // addBook.id
            androidx.lifecycle.MutableLiveData<java.lang.Integer> addBookId = null;
            // addBook != null
            boolean addBookJavaLangObjectNull = false;
            // addBook.id != null
            boolean addBookIdJavaLangObjectNull = false;
            // addBook
            com.example.recyclerbinding.BookAddViewModel addBook = mAddBook;
            // addBook.id.getValue()
            java.lang.Integer addBookIdGetValue = null;



            addBookJavaLangObjectNull = (addBook) != (null);
            if (addBookJavaLangObjectNull) {


                addBookId = addBook.id;

                addBookIdJavaLangObjectNull = (addBookId) != (null);
                if (addBookIdJavaLangObjectNull) {




                    addBookId.setValue(((java.lang.Integer) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editDatePublishandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addBook.published.getValue()
            //         is addBook.published.setValue((java.lang.Integer) callbackArg_0)
            int callbackArg_0 = com.example.recyclerbinding.AdapterToString.getIntegerFromBinding(editDatePublish);
            // localize variables for thread safety
            // addBook.published.getValue()
            java.lang.Integer addBookPublishedGetValue = null;
            // addBook.published != null
            boolean addBookPublishedJavaLangObjectNull = false;
            // addBook != null
            boolean addBookJavaLangObjectNull = false;
            // addBook.published
            androidx.lifecycle.MutableLiveData<java.lang.Integer> addBookPublished = null;
            // addBook
            com.example.recyclerbinding.BookAddViewModel addBook = mAddBook;



            addBookJavaLangObjectNull = (addBook) != (null);
            if (addBookJavaLangObjectNull) {


                addBookPublished = addBook.published;

                addBookPublishedJavaLangObjectNull = (addBookPublished) != (null);
                if (addBookPublishedJavaLangObjectNull) {




                    addBookPublished.setValue(((java.lang.Integer) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addBook.description.getValue()
            //         is addBook.description.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editDescription);
            // localize variables for thread safety
            // addBook.description != null
            boolean addBookDescriptionJavaLangObjectNull = false;
            // addBook != null
            boolean addBookJavaLangObjectNull = false;
            // addBook.description.getValue()
            java.lang.String addBookDescriptionGetValue = null;
            // addBook.description
            androidx.lifecycle.MutableLiveData<java.lang.String> addBookDescription = null;
            // addBook
            com.example.recyclerbinding.BookAddViewModel addBook = mAddBook;



            addBookJavaLangObjectNull = (addBook) != (null);
            if (addBookJavaLangObjectNull) {


                addBookDescription = addBook.description;

                addBookDescriptionJavaLangObjectNull = (addBookDescription) != (null);
                if (addBookDescriptionJavaLangObjectNull) {




                    addBookDescription.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTitleandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addBook.title.getValue()
            //         is addBook.title.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTitle);
            // localize variables for thread safety
            // addBook.title
            androidx.lifecycle.MutableLiveData<java.lang.String> addBookTitle = null;
            // addBook != null
            boolean addBookJavaLangObjectNull = false;
            // addBook.title.getValue()
            java.lang.String addBookTitleGetValue = null;
            // addBook.title != null
            boolean addBookTitleJavaLangObjectNull = false;
            // addBook
            com.example.recyclerbinding.BookAddViewModel addBook = mAddBook;



            addBookJavaLangObjectNull = (addBook) != (null);
            if (addBookJavaLangObjectNull) {


                addBookTitle = addBook.title;

                addBookTitleJavaLangObjectNull = (addBookTitle) != (null);
                if (addBookTitleJavaLangObjectNull) {




                    addBookTitle.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivitySecondBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivitySecondBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[6]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[8]
            );
        this.buttonSave.setTag(null);
        this.editAuthor.setTag(null);
        this.editBookId.setTag(null);
        this.editDatePublish.setTag(null);
        this.editDescription.setTag(null);
        this.editTitle.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.recyclerbinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.addBook == variableId) {
            setAddBook((com.example.recyclerbinding.BookAddViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddBook(@Nullable com.example.recyclerbinding.BookAddViewModel AddBook) {
        this.mAddBook = AddBook;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.addBook);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAddBookAuthor((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeAddBookId((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeAddBookTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeAddBookDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeAddBookPublished((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAddBookAuthor(androidx.lifecycle.MutableLiveData<java.lang.String> AddBookAuthor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddBookId(androidx.lifecycle.MutableLiveData<java.lang.Integer> AddBookId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddBookTitle(androidx.lifecycle.MutableLiveData<java.lang.String> AddBookTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddBookDescription(androidx.lifecycle.MutableLiveData<java.lang.String> AddBookDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddBookPublished(androidx.lifecycle.MutableLiveData<java.lang.Integer> AddBookPublished, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.String> addBookAuthor = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> addBookId = null;
        int androidxDatabindingViewDataBindingSafeUnboxAddBookIdGetValue = 0;
        java.lang.String addBookDescriptionGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxAddBookPublishedGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> addBookTitle = null;
        java.lang.String addBookTitleGetValue = null;
        java.lang.Integer addBookIdGetValue = null;
        java.lang.Integer addBookPublishedGetValue = null;
        java.lang.String addBookAuthorGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> addBookDescription = null;
        com.example.recyclerbinding.BookAddViewModel addBook = mAddBook;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> addBookPublished = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (addBook != null) {
                        // read addBook.author
                        addBookAuthor = addBook.author;
                    }
                    updateLiveDataRegistration(0, addBookAuthor);


                    if (addBookAuthor != null) {
                        // read addBook.author.getValue()
                        addBookAuthorGetValue = addBookAuthor.getValue();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (addBook != null) {
                        // read addBook.id
                        addBookId = addBook.id;
                    }
                    updateLiveDataRegistration(1, addBookId);


                    if (addBookId != null) {
                        // read addBook.id.getValue()
                        addBookIdGetValue = addBookId.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addBook.id.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxAddBookIdGetValue = androidx.databinding.ViewDataBinding.safeUnbox(addBookIdGetValue);
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (addBook != null) {
                        // read addBook.title
                        addBookTitle = addBook.title;
                    }
                    updateLiveDataRegistration(2, addBookTitle);


                    if (addBookTitle != null) {
                        // read addBook.title.getValue()
                        addBookTitleGetValue = addBookTitle.getValue();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (addBook != null) {
                        // read addBook.description
                        addBookDescription = addBook.description;
                    }
                    updateLiveDataRegistration(3, addBookDescription);


                    if (addBookDescription != null) {
                        // read addBook.description.getValue()
                        addBookDescriptionGetValue = addBookDescription.getValue();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (addBook != null) {
                        // read addBook.published
                        addBookPublished = addBook.published;
                    }
                    updateLiveDataRegistration(4, addBookPublished);


                    if (addBookPublished != null) {
                        // read addBook.published.getValue()
                        addBookPublishedGetValue = addBookPublished.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addBook.published.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxAddBookPublishedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(addBookPublishedGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.buttonSave.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editAuthor, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editAuthorandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editBookId, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editBookIdandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editDatePublish, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editDatePublishandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTitle, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTitleandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editAuthor, addBookAuthorGetValue);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            com.example.recyclerbinding.AdapterToString.bindIntegerInText(this.editBookId, androidxDatabindingViewDataBindingSafeUnboxAddBookIdGetValue);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            com.example.recyclerbinding.AdapterToString.bindIntegerInText(this.editDatePublish, androidxDatabindingViewDataBindingSafeUnboxAddBookPublishedGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editDescription, addBookDescriptionGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTitle, addBookTitleGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // addBook != null
        boolean addBookJavaLangObjectNull = false;
        // addBook
        com.example.recyclerbinding.BookAddViewModel addBook = mAddBook;



        addBookJavaLangObjectNull = (addBook) != (null);
        if (addBookJavaLangObjectNull) {


            addBook.save();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): addBook.author
        flag 1 (0x2L): addBook.id
        flag 2 (0x3L): addBook.title
        flag 3 (0x4L): addBook.description
        flag 4 (0x5L): addBook.published
        flag 5 (0x6L): addBook
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}