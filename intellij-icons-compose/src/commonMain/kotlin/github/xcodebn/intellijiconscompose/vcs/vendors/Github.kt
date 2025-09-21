package github.xcodebn.intellijiconscompose.vcs.vendors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Github: ImageVector
    get() {
        if (_Github != null) return _Github!!

        _Github = ImageVector.Builder(
            name = "Github",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF161514)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                curveTo(4.13f, 1.00f, 1.00f, 4.13f, 1.00f, 8.00f)
                curveTo(1.00f, 11.09f, 3.00f, 13.71f, 5.79f, 14.64f)
                curveTo(6.14f, 14.70f, 6.26f, 14.49f, 6.26f, 14.30f)
                curveTo(6.26f, 14.13f, 6.26f, 13.69f, 6.25f, 13.11f)
                curveTo(4.31f, 13.53f, 3.90f, 12.17f, 3.90f, 12.17f)
                curveTo(3.58f, 11.36f, 3.12f, 11.15f, 3.12f, 11.15f)
                curveTo(2.48f, 10.71f, 3.17f, 10.72f, 3.17f, 10.72f)
                curveTo(3.87f, 10.77f, 4.24f, 11.44f, 4.24f, 11.44f)
                curveTo(4.86f, 12.51f, 5.88f, 12.20f, 6.28f, 12.03f)
                curveTo(6.34f, 11.57f, 6.52f, 11.27f, 6.72f, 11.09f)
                curveTo(5.17f, 10.91f, 3.53f, 10.31f, 3.53f, 7.63f)
                curveTo(3.53f, 6.87f, 3.81f, 6.24f, 4.25f, 5.75f)
                curveTo(4.18f, 5.58f, 3.94f, 4.87f, 4.32f, 3.90f)
                curveTo(4.32f, 3.90f, 4.91f, 3.71f, 6.25f, 4.62f)
                curveTo(6.80f, 4.46f, 7.40f, 4.39f, 8.00f, 4.38f)
                curveTo(8.59f, 4.39f, 9.19f, 4.46f, 9.75f, 4.62f)
                curveTo(11.09f, 3.71f, 11.67f, 3.90f, 11.67f, 3.90f)
                curveTo(12.05f, 4.87f, 11.81f, 5.58f, 11.74f, 5.75f)
                curveTo(12.19f, 6.24f, 12.46f, 6.87f, 12.46f, 7.63f)
                curveTo(12.46f, 10.32f, 10.83f, 10.91f, 9.27f, 11.08f)
                curveTo(9.52f, 11.30f, 9.74f, 11.73f, 9.74f, 12.38f)
                curveTo(9.74f, 13.32f, 9.73f, 14.07f, 9.73f, 14.30f)
                curveTo(9.73f, 14.49f, 9.86f, 14.71f, 10.21f, 14.64f)
                curveTo(12.99f, 13.71f, 15.00f, 11.09f, 15.00f, 8.00f)
                curveTo(15.00f, 4.13f, 11.86f, 1.00f, 8.00f, 1.00f)
            }
        }.build()

        return _Github!!
    }

private var _Github: ImageVector? = null

