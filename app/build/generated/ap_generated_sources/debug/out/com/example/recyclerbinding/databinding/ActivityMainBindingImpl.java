package com.example.recyclerbinding.databinding;
import com.example.recyclerbinding.R;
import com.example.recyclerbinding.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.example.recyclerbinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.button.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.recyclerbinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.buttonAdapter == variableId) {
            setButtonAdapter((com.example.recyclerbinding.BookViewModel) variable);
        }
        else if (BR.myyAdapter == variableId) {
            setMyyAdapter((com.example.recyclerbinding.AdapterRecycler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setButtonAdapter(@Nullable com.example.recyclerbinding.BookViewModel ButtonAdapter) {
        this.mButtonAdapter = ButtonAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.buttonAdapter);
        super.requestRebind();
    }
    public void setMyyAdapter(@Nullable com.example.recyclerbinding.AdapterRecycler MyyAdapter) {
        this.mMyyAdapter = MyyAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.myyAdapter);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.recyclerbinding.BookViewModel buttonAdapter = mButtonAdapter;
        com.example.recyclerbinding.AdapterRecycler myyAdapter = mMyyAdapter;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.button.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.recyclerView.setAdapter(myyAdapter);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // buttonAdapter
        com.example.recyclerbinding.BookViewModel buttonAdapter = mButtonAdapter;
        // buttonAdapter != null
        boolean buttonAdapterJavaLangObjectNull = false;



        buttonAdapterJavaLangObjectNull = (buttonAdapter) != (null);
        if (buttonAdapterJavaLangObjectNull) {



            buttonAdapter.addBookButtonClicked(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): buttonAdapter
        flag 1 (0x2L): myyAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}