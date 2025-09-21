package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Netezza: ImageVector
    get() {
        if (_Netezza != null) return _Netezza!!

        _Netezza = ImageVector.Builder(
            name = "Netezza",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFB7C003)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 14f)
                curveTo(11.43f, 14.21f, 14.21f, 11.43f, 14.21f, 8.00f)
                curveTo(14.21f, 4.57f, 11.43f, 1.79f, 8.00f, 1.79f)
                curveTo(4.57f, 1.79f, 1.79f, 4.57f, 1.79f, 8.00f)
                curveTo(1.79f, 11.43f, 4.57f, 14.21f, 8.00f, 14.21f)
                close()
                moveTo(8f, 15f)
                curveTo(11.87f, 15.00f, 15.00f, 11.87f, 15.00f, 8.00f)
                curveTo(15.00f, 4.13f, 11.87f, 1.00f, 8.00f, 1.00f)
                curveTo(4.13f, 1.00f, 1.00f, 4.13f, 1.00f, 8.00f)
                curveTo(1.00f, 11.87f, 4.13f, 15.00f, 8.00f, 15.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF166671))
            ) {
                moveTo(7f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                lineTo(9f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                lineTo(7f, 4f)
                close()
            }
        }.build()

        return _Netezza!!
    }

private var _Netezza: ImageVector? = null

