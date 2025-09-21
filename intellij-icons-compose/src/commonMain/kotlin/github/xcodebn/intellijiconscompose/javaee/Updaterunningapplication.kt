package github.xcodebn.intellijiconscompose.javaee

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Updaterunningapplication: ImageVector
    get() {
        if (_Updaterunningapplication != null) return _Updaterunningapplication!!

        _Updaterunningapplication = ImageVector.Builder(
            name = "Updaterunningapplication",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 3f)
                curveTo(5.10f, 2.54f, 6.46f, 2.00f, 7.95f, 2.00f)
                curveTo(11.26f, 2.00f, 13.95f, 4.68f, 13.95f, 8.00f)
                curveTo(13.95f, 11.31f, 11.26f, 14.00f, 7.95f, 14.00f)
                curveTo(5.08f, 14.00f, 2.69f, 11.99f, 2.09f, 9.30f)
                lineTo(4f, 9f)
                curveTo(4.45f, 10.93f, 6.05f, 12.19f, 7.95f, 12.19f)
                curveTo(10.27f, 12.19f, 12.15f, 10.31f, 12.15f, 7.99f)
                curveTo(12.15f, 5.67f, 10.27f, 3.79f, 7.95f, 3.79f)
                curveTo(6.99f, 3.79f, 6.11f, 4.12f, 5.40f, 4.66f)
                lineTo(8f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 1f)
                lineTo(4f, 3f)
                close()
            }
        }.build()

        return _Updaterunningapplication!!
    }

private var _Updaterunningapplication: ImageVector? = null

