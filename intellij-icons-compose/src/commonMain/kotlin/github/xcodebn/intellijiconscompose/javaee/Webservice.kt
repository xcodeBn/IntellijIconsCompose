package github.xcodebn.intellijiconscompose.javaee

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Webservice: ImageVector
    get() {
        if (_Webservice != null) return _Webservice!!

        _Webservice = ImageVector.Builder(
            name = "Webservice",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                curveTo(4.14f, 1.00f, 1.00f, 4.14f, 1.00f, 8.00f)
                curveTo(1.00f, 11.86f, 4.14f, 15.00f, 8.00f, 15.00f)
                curveTo(11.86f, 15.00f, 15.00f, 11.86f, 15.00f, 8.00f)
                curveTo(15.00f, 4.14f, 11.86f, 1.00f, 8.00f, 1.00f)
                close()
                moveTo(7f, 14f)
                curveTo(4.54f, 13.21f, 2.40f, 10.86f, 2.40f, 8.00f)
                curveTo(2.40f, 7.57f, 2.46f, 7.15f, 2.55f, 6.75f)
                lineTo(6f, 10f)
                lineTo(6f, 11f)
                curveTo(5.90f, 11.57f, 6.53f, 12.20f, 7.30f, 12.20f)
                lineTo(7f, 14f)
                close()
                moveTo(12f, 12f)
                curveTo(11.95f, 11.21f, 11.43f, 10.80f, 10.80f, 10.80f)
                lineTo(10f, 11f)
                lineTo(10f, 9f)
                curveTo(10.10f, 8.31f, 9.79f, 8.00f, 9.40f, 8.00f)
                lineTo(5f, 8f)
                lineTo(5f, 7f)
                lineTo(7f, 7f)
                curveTo(6.99f, 6.60f, 7.30f, 6.29f, 7.30f, 5.90f)
                lineTo(7f, 4f)
                lineTo(9f, 4f)
                curveTo(9.47f, 4.50f, 10.10f, 3.87f, 10.10f, 3.10f)
                lineTo(10f, 3f)
                curveTo(12.15f, 3.65f, 13.60f, 5.66f, 13.60f, 8.00f)
                curveTo(13.60f, 9.46f, 13.04f, 10.78f, 12.13f, 11.77f)
                close()
            }
        }.build()

        return _Webservice!!
    }

private var _Webservice: ImageVector? = null

