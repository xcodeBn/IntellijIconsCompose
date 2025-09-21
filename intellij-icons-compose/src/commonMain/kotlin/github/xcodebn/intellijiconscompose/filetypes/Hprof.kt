package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hprof: ImageVector
    get() {
        if (_Hprof != null) return _Hprof!!

        _Hprof = ImageVector.Builder(
            name = "Hprof",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0)),
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
                moveTo(2f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 12f)
                curveTo(9.56f, 12.50f, 10.00f, 12.38f, 10.00f, 11.75f)
                curveTo(10.00f, 11.12f, 9.56f, 11.00f, 8.90f, 11.00f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                close()
                moveTo(7f, 10f)
                horizontalLineTo(9f)
                curveTo(10.14f, 10.00f, 11.00f, 10.64f, 11.00f, 11.65f)
                curveTo(11.00f, 13.29f, 9.97f, 13.50f, 8.87f, 13.50f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 15f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(14.20f, 10.00f, 14.66f, 10.18f, 14.96f, 10.51f)
                curveTo(15.22f, 10.79f, 15.36f, 11.18f, 15.36f, 11.65f)
                verticalLineTo(12f)
                curveTo(15.36f, 12.47f, 14.96f, 12.98f, 14.37f, 13.21f)
                lineTo(16f, 15f)
                horizontalLineTo(14f)
                lineTo(13f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                close()
                moveTo(13f, 12f)
                horizontalLineTo(14f)
                curveTo(14.05f, 12.43f, 14.33f, 12.14f, 14.33f, 11.72f)
                verticalLineTo(12f)
                curveTo(14.33f, 11.24f, 14.03f, 10.99f, 13.53f, 10.99f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _Hprof!!
    }

private var _Hprof: ImageVector? = null

