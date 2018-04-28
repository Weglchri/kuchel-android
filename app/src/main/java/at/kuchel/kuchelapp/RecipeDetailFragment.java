package at.kuchel.kuchelapp;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import at.kuchel.kuchelapp.api.Recipe;
import at.kuchel.kuchelapp.service.GlobalParamService;

import static at.kuchel.kuchelapp.Constants.GLOBAL_PARAM.USERNAME;

/**
 * A fragment representing a single Recipe detail screen.
 * This fragment is either contained in a {@link RecipeListActivity}
 * in two-pane mode (on tablets) or a {@link RecipeDetailActivity}
 * on handsets.
 */
public class RecipeDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    private Recipe recipe;
    private Bitmap image;

    public RecipeDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Log.i("retrieve_recipe_rest", String.format("Retrieved  recipe with id %s from db", recipe.getId()));

        CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) this.getActivity().findViewById(R.id.toolbar_layout_detailed);
        if (appBarLayout != null) {
            appBarLayout.setTitle(recipe.getName());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recipe_detail, container, false);

        return rootView;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
