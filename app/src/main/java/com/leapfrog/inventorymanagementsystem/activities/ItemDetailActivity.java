package com.leapfrog.inventorymanagementsystem.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.leapfrog.inventorymanagementsystem.R;
import com.leapfrog.inventorymanagementsystem.data.Extras;
import com.leapfrog.inventorymanagementsystem.models.Item;
import com.leapfrog.inventorymanagementsystem.presenters.ItemDetailPresenter;
import com.leapfrog.inventorymanagementsystem.views.ItemDetailView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ItemDetailActivity extends AppCompatActivity implements ItemDetailView {

    ItemDetailPresenter itemDetailPresenter;

    @Bind(R.id.iv_item_pic)
    ImageView ivItemPic;

    @Bind(R.id.tv_price)
    TextView tvPrice;

    @Bind(R.id.ll_parent)
    LinearLayout linearLayout;

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        itemDetailPresenter = new ItemDetailPresenter(this);

        setSupportActionBar(toolbar);

        if (getIntent().hasExtra(Extras.KEY_ITEM_EXTRA)) {
            Item item = getIntent().getParcelableExtra(Extras.KEY_ITEM_EXTRA);
            this.item = item;

            Glide.with(this).load(item.getPicDrawableId()).into(ivItemPic);

            tvPrice.setText(item.getPrice());
        }

        setToolbar();
    }

    private void setToolbar() {
        ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(item.getItemName());
    }

    @Override
    public int getQuantity() {
        return Integer.parseInt("1");
    }

    @Override
    public String getItemCode() {
        return item.getItemCode();
    }

    @Override
    public void purchaseSuccessful() {
        Toast.makeText(ItemDetailActivity.this, "Purchase Successful", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void purchaseFailure() {
        Toast.makeText(this, "Item is not available", Toast.LENGTH_SHORT).show();
    }

    public void buyItem(View view) {
        itemDetailPresenter.buyItems();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_detail_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_add_to_cart) {
            itemDetailPresenter.addToCart(this.item);
        }

        return super.onOptionsItemSelected(item);
    }
}
