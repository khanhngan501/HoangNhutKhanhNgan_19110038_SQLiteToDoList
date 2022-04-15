package hcmute.edu.vn.mssv19110038.hoangnhutkhanhngan_19110038_sqlitetodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CongViecAdapter extends BaseAdapter {

    public MainActivity context;
    private int layout;
    private List<CongViec>  congviecList;

    public CongViecAdapter(MainActivity context, int layout, List<CongViec> congviecList) {
        this.context = context;
        this.layout = layout;
        this.congviecList = congviecList;
    }

    @Override
    public int getCount() {
        return congviecList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txtTen;
        ImageView imgDelete, imgEdit;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       ViewHolder holder;
       if(view == null){
           holder = new ViewHolder();
           LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           view = inflater.inflate(layout, null);
           holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);
           holder.imgDelete = (ImageView) view.findViewById(R.id.imageviewDelete);
           holder.imgEdit = (ImageView) view.findViewById(R.id.imageviewEdit);
           view.setTag(holder);
       }
       else {
           holder = (ViewHolder) view.getTag();
       }

       CongViec congViec = congviecList.get(i);

       holder.txtTen.setText(congViec.getTenCV());

//       Bắt sự kiện xóa và sửa
        holder.imgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(context, "Sửa " + congViec.getTenCV(), Toast.LENGTH_SHORT).show();
                context.DialogSuaCongViec(congViec.getTenCV(), congViec.getIdCV());
            }
        });

        holder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.DialogXoaCV(congViec.getTenCV(), congViec.getIdCV());
            }
        });

        return view;
    }
}
