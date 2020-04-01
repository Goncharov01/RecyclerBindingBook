package com.example.recyclerbinding.databinding;
import com.example.recyclerbinding.R;
import com.example.recyclerbinding.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TaskItemListBindingImpl extends TaskItemListBinding  {

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
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TaskItemListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private TaskItemListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.bookAuthor.setTag(null);
        this.bookDescription.setTag(null);
        this.bookId.setTag(null);
        this.bookPublished.setTag(null);
        this.bookTitle.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.model == variableId) {
            setModel((com.example.recyclerbinding.Book) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.recyclerbinding.Book Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
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
        com.example.recyclerbinding.Book model = mModel;
        java.lang.String modelAuthor = null;
        java.lang.String modelTitle = null;
        java.lang.Integer modelPublished = null;
        java.lang.String stringValueOfModelPublished = null;
        java.lang.String stringValueOfModelId = null;
        java.lang.String modelDescription = null;
        java.lang.Integer modelId = null;
        int androidxDatabindingViewDataBindingSafeUnboxModelId = 0;
        int androidxDatabindingViewDataBindingSafeUnboxModelPublished = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.author
                    modelAuthor = model.getAuthor();
                    // read model.title
                    modelTitle = model.getTitle();
                    // read model.published
                    modelPublished = model.getPublished();
                    // read model.description
                    modelDescription = model.getDescription();
                    // read model.id
                    modelId = model.getId();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(model.published)
                androidxDatabindingViewDataBindingSafeUnboxModelPublished = androidx.databinding.ViewDataBinding.safeUnbox(modelPublished);
                // read androidx.databinding.ViewDataBinding.safeUnbox(model.id)
                androidxDatabindingViewDataBindingSafeUnboxModelId = androidx.databinding.ViewDataBinding.safeUnbox(modelId);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(model.published))
                stringValueOfModelPublished = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxModelPublished);
                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(model.id))
                stringValueOfModelId = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxModelId);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bookAuthor, modelAuthor);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bookDescription, modelDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bookId, stringValueOfModelId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bookPublished, stringValueOfModelPublished);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bookTitle, modelTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}