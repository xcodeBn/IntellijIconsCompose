package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dynamicusages: ImageVector
    get() {
        if (_Dynamicusages != null) return _Dynamicusages!!

        _Dynamicusages = ImageVector.Builder(
            name = "Dynamicusages",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 10f)
                curveTo(1.00f, 12.99f, 3.01f, 15.00f, 5.50f, 15.00f)
                curveTo(7.99f, 15.00f, 10.00f, 12.99f, 10.00f, 10.50f)
                curveTo(10.00f, 8.01f, 7.99f, 6.00f, 5.50f, 6.00f)
                curveTo(3.01f, 6.00f, 1.00f, 8.01f, 1.00f, 10.50f)
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 5f)
                curveTo(4.88f, 5.03f, 5.19f, 5.00f, 5.50f, 5.00f)
                curveTo(8.54f, 5.00f, 11.00f, 7.46f, 11.00f, 10.50f)
                curveTo(11.00f, 10.81f, 10.97f, 11.12f, 10.92f, 11.42f)
                curveTo(11.89f, 10.60f, 12.50f, 9.37f, 12.50f, 8.00f)
                curveTo(12.50f, 5.51f, 10.49f, 3.50f, 8.00f, 3.50f)
                curveTo(6.63f, 3.50f, 5.40f, 4.11f, 4.58f, 5.08f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 3f)
                curveTo(7.38f, 2.53f, 7.69f, 2.50f, 8.00f, 2.50f)
                curveTo(11.04f, 2.50f, 13.50f, 4.96f, 13.50f, 8.00f)
                curveTo(13.50f, 8.31f, 13.47f, 8.62f, 13.42f, 8.92f)
                curveTo(14.39f, 8.10f, 15.00f, 6.87f, 15.00f, 5.50f)
                curveTo(15.00f, 3.01f, 12.99f, 1.00f, 10.50f, 1.00f)
                curveTo(9.13f, 1.00f, 7.90f, 1.61f, 7.08f, 2.58f)
                close()
            }
        }.build()

        return _Dynamicusages!!
    }

private var _Dynamicusages: ImageVector? = null

