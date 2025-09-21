package github.xcodebn.intellijiconscompose.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ExtannotationDark: ImageVector
    get() {
        if (_ExtannotationDark != null) return _ExtannotationDark!!

        _ExtannotationDark = ImageVector.Builder(
            name = "ExtannotationDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 3f)
                curveTo(4.34f, 3.56f, 4.18f, 3.72f, 4.06f, 3.91f)
                curveTo(3.94f, 4.09f, 3.85f, 4.30f, 3.80f, 4.53f)
                curveTo(3.75f, 4.76f, 3.72f, 5.00f, 3.72f, 5.23f)
                curveTo(3.72f, 5.73f, 3.81f, 6.09f, 4.00f, 6.32f)
                curveTo(4.19f, 6.56f, 4.44f, 6.68f, 4.76f, 6.68f)
                curveTo(4.96f, 6.68f, 5.14f, 6.63f, 5.30f, 6.54f)
                curveTo(5.45f, 6.45f, 5.57f, 6.32f, 5.67f, 6.15f)
                curveTo(5.76f, 5.99f, 5.83f, 5.80f, 5.88f, 5.58f)
                curveTo(5.92f, 5.37f, 5.96f, 5.13f, 5.97f, 4.87f)
                lineTo(6f, 3f)
                lineTo(6f, 3f)
                curveTo(5.86f, 3.33f, 5.75f, 3.31f, 5.63f, 3.30f)
                curveTo(5.50f, 3.28f, 5.38f, 3.28f, 5.25f, 3.28f)
                curveTo(4.97f, 3.28f, 4.73f, 3.34f, 4.54f, 3.45f)
                close()
                moveTo(0f, 5f)
                curveTo(0.00f, 0.00f, 4.58f, 0.00f, 5.40f, 0.00f)
                curveTo(5.81f, 0.00f, 10.00f, 0.11f, 10.00f, 4.45f)
                curveTo(10.00f, 7.51f, 8.09f, 7.50f, 7.71f, 7.50f)
                curveTo(7.09f, 7.46f, 6.64f, 7.22f, 6.37f, 6.76f)
                curveTo(5.85f, 7.25f, 5.35f, 7.50f, 4.86f, 7.50f)
                curveTo(3.85f, 7.50f, 2.50f, 7.40f, 2.50f, 5.00f)
                curveTo(2.50f, 2.90f, 4.32f, 2.50f, 5.00f, 2.50f)
                curveTo(5.19f, 2.50f, 7.18f, 2.57f, 7.28f, 2.60f)
                lineTo(7f, 5f)
                curveTo(7.12f, 6.07f, 7.32f, 6.51f, 7.79f, 6.56f)
                curveTo(8.70f, 6.56f, 8.83f, 4.73f, 8.83f, 4.43f)
                curveTo(8.83f, 1.13f, 5.89f, 0.93f, 5.40f, 0.93f)
                curveTo(4.71f, 0.93f, 1.18f, 1.06f, 1.18f, 5.00f)
                curveTo(1.18f, 5.73f, 1.18f, 9.06f, 4.86f, 9.06f)
                curveTo(5.11f, 9.06f, 7.18f, 8.80f, 7.70f, 8.54f)
                lineTo(8f, 9f)
                curveTo(7.32f, 9.63f, 6.37f, 10.00f, 4.87f, 10.00f)
                curveTo(3.94f, 10.00f, 0.00f, 10.00f, 0.00f, 5.00f)
                close()
            }
        }.build()

        return _ExtannotationDark!!
    }

private var _ExtannotationDark: ImageVector? = null

