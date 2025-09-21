package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Jvm: ImageVector
    get() {
        if (_Jvm != null) return _Jvm!!

        _Jvm = ImageVector.Builder(
            name = "Jvm",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0)),
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
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(4f, 10f)
                curveTo(4.02f, 10.50f, 4.40f, 10.35f, 4.67f, 10.06f)
                curveTo(4.94f, 9.77f, 5.10f, 9.34f, 5.10f, 8.75f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                curveTo(4.27f, 9.39f, 3.98f, 9.70f, 3.55f, 9.70f)
                curveTo(3.16f, 9.70f, 2.90f, 9.49f, 2.63f, 9.11f)
                lineTo(2f, 10f)
                curveTo(2.40f, 10.15f, 2.86f, 10.50f, 3.56f, 10.50f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 6f)
                horizontalLineTo(10f)
                lineTo(12f, 8f)
                lineTo(13f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                lineTo(12f, 9f)
                lineTo(10f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(7f, 10f)
                horizontalLineTo(8f)
                lineTo(10f, 6f)
                horizontalLineTo(9f)
                lineTo(7f, 9f)
                lineTo(6f, 6f)
                horizontalLineTo(5f)
                lineTo(7f, 10f)
                close()
            }
        }.build()

        return _Jvm!!
    }

private var _Jvm: ImageVector? = null

