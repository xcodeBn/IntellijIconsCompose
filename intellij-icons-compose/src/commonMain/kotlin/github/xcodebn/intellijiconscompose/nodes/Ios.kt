package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ios: ImageVector
    get() {
        if (_Ios != null) return _Ios!!

        _Ios = ImageVector.Builder(
            name = "Ios",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color(0xFFD9D9D9)),
                strokeLineWidth = 0.1f
            ) {
                moveTo(12f, 1f)
                horizontalLineTo(4f)
                curveTo(2.45f, 1.00f, 1.00f, 2.45f, 1.00f, 4.25f)
                verticalLineTo(12f)
                curveTo(1.00f, 13.55f, 2.45f, 15.00f, 4.25f, 15.00f)
                horizontalLineTo(12f)
                curveTo(13.55f, 15.00f, 15.00f, 13.55f, 15.00f, 11.75f)
                verticalLineTo(4f)
                curveTo(15.00f, 2.45f, 13.55f, 1.00f, 11.75f, 1.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 11f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                close()
                moveTo(3f, 5f)
                curveTo(2.99f, 5.37f, 2.88f, 5.26f, 2.88f, 5.13f)
                curveTo(2.88f, 4.98f, 2.99f, 4.87f, 3.13f, 4.87f)
                curveTo(3.27f, 4.87f, 3.39f, 4.98f, 3.39f, 5.13f)
                curveTo(3.39f, 5.26f, 3.27f, 5.37f, 3.13f, 5.37f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 11f)
                curveTo(4.89f, 10.94f, 3.87f, 9.77f, 3.87f, 7.90f)
                curveTo(3.87f, 6.05f, 4.89f, 4.87f, 6.50f, 4.87f)
                curveTo(8.10f, 4.87f, 9.13f, 6.05f, 9.13f, 7.90f)
                curveTo(9.13f, 9.77f, 8.11f, 10.94f, 6.50f, 10.94f)
                verticalLineTo(11f)
                close()
                moveTo(6f, 5f)
                curveTo(5.10f, 5.17f, 4.20f, 6.23f, 4.20f, 7.90f)
                curveTo(4.20f, 9.57f, 5.10f, 10.64f, 6.50f, 10.64f)
                curveTo(7.90f, 10.64f, 8.80f, 9.57f, 8.80f, 7.90f)
                curveTo(8.80f, 6.23f, 7.90f, 5.17f, 6.50f, 5.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 11f)
                curveTo(10.26f, 10.94f, 9.40f, 10.26f, 9.35f, 9.28f)
                horizontalLineTo(10f)
                curveTo(9.72f, 10.08f, 10.47f, 10.64f, 11.50f, 10.64f)
                curveTo(12.50f, 10.64f, 13.20f, 10.07f, 13.20f, 9.31f)
                curveTo(13.20f, 8.69f, 12.78f, 8.33f, 11.79f, 8.08f)
                lineTo(11f, 8f)
                curveTo(10.00f, 7.63f, 9.51f, 7.19f, 9.51f, 6.45f)
                curveTo(9.51f, 5.53f, 10.36f, 4.87f, 11.44f, 4.87f)
                curveTo(12.55f, 4.87f, 13.38f, 5.53f, 13.42f, 6.39f)
                horizontalLineTo(13f)
                curveTo(13.05f, 5.69f, 12.36f, 5.17f, 11.43f, 5.17f)
                curveTo(10.54f, 5.17f, 9.84f, 5.70f, 9.84f, 6.45f)
                curveTo(9.84f, 7.03f, 10.27f, 7.37f, 11.22f, 7.61f)
                lineTo(12f, 8f)
                curveTo(13.02f, 8.06f, 13.53f, 8.50f, 13.53f, 9.28f)
                curveTo(13.53f, 10.26f, 12.71f, 10.94f, 11.47f, 10.94f)
                lineTo(11f, 11f)
                close()
            }
        }.build()

        return _Ios!!
    }

private var _Ios: ImageVector? = null

