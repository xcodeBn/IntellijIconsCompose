package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Js: ImageVector
    get() {
        if (_Js != null) return _Js!!

        _Js = ImageVector.Builder(
            name = "Js",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF4AF3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 7f)
                curveTo(9.17f, 6.36f, 9.54f, 6.20f, 10.21f, 6.20f)
                curveTo(10.22f, 6.20f, 11.60f, 6.20f, 11.60f, 6.20f)
                verticalLineTo(5f)
                curveTo(11.60f, 5.00f, 10.27f, 5.00f, 10.23f, 5.00f)
                curveTo(8.93f, 5.00f, 8.00f, 5.55f, 8.00f, 6.74f)
                curveTo(8.00f, 7.78f, 8.50f, 8.23f, 9.77f, 8.50f)
                curveTo(10.69f, 8.70f, 11.00f, 8.87f, 11.00f, 9.26f)
                curveTo(11.00f, 9.64f, 10.57f, 9.80f, 9.77f, 9.80f)
                curveTo(9.75f, 9.80f, 8.36f, 9.80f, 8.36f, 9.80f)
                verticalLineTo(11f)
                curveTo(8.36f, 11.00f, 9.76f, 11.00f, 9.77f, 11.00f)
                curveTo(12.20f, 11.00f, 12.20f, 9.80f, 12.20f, 9.26f)
                curveTo(12.20f, 8.50f, 11.62f, 7.90f, 10.59f, 7.58f)
                curveTo(9.56f, 7.25f, 9.17f, 7.24f, 9.17f, 6.80f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 9f)
                curveTo(3.95f, 9.61f, 4.21f, 9.80f, 4.74f, 9.80f)
                curveTo(5.38f, 9.80f, 5.60f, 9.31f, 5.60f, 8.96f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                curveTo(6.80f, 10.18f, 5.99f, 11.00f, 4.94f, 11.00f)
                curveTo(3.95f, 11.00f, 3.38f, 10.72f, 2.96f, 10.18f)
                lineTo(4f, 9f)
                close()
            }
        }.build()

        return _Js!!
    }

private var _Js: ImageVector? = null

