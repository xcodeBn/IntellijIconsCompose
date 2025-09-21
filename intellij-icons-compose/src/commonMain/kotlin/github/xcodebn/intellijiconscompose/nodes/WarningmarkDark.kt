package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningmarkDark: ImageVector
    get() {
        if (_WarningmarkDark != null) return _WarningmarkDark!!

        _WarningmarkDark = ImageVector.Builder(
            name = "WarningmarkDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF4AF3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 8f)
                lineTo(16f, 16f)
                horizontalLineTo(7f)
                lineTo(12f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                close()
                moveTo(12f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _WarningmarkDark!!
    }

private var _WarningmarkDark: ImageVector? = null

