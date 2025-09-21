package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Jfr: ImageVector
    get() {
        if (_Jfr != null) return _Jfr!!

        _Jfr = ImageVector.Builder(
            name = "Jfr",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                verticalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 15f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                curveTo(12.70f, 10.00f, 13.16f, 10.18f, 13.46f, 10.51f)
                curveTo(13.72f, 10.79f, 13.86f, 11.18f, 13.86f, 11.65f)
                verticalLineTo(12f)
                curveTo(13.86f, 12.47f, 13.46f, 12.98f, 12.87f, 13.21f)
                lineTo(14f, 15f)
                horizontalLineTo(13f)
                lineTo(12f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                close()
                moveTo(11f, 12f)
                horizontalLineTo(12f)
                curveTo(12.55f, 12.43f, 12.83f, 12.14f, 12.83f, 11.72f)
                verticalLineTo(12f)
                curveTo(12.83f, 11.24f, 12.53f, 10.99f, 12.03f, 10.99f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 14f)
                curveTo(2.62f, 13.84f, 2.84f, 14.00f, 3.29f, 14.00f)
                curveTo(3.81f, 14.00f, 4.00f, 13.59f, 4.00f, 13.30f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                curveTo(5.00f, 14.32f, 4.33f, 15.00f, 3.45f, 15.00f)
                curveTo(2.63f, 15.00f, 2.15f, 14.76f, 1.80f, 14.32f)
                lineTo(2f, 14f)
                close()
            }
        }.build()

        return _Jfr!!
    }

private var _Jfr: ImageVector? = null

