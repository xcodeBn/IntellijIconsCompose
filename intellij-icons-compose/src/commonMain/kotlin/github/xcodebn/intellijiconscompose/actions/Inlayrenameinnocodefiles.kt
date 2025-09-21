package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inlayrenameinnocodefiles: ImageVector
    get() {
        if (_Inlayrenameinnocodefiles != null) return _Inlayrenameinnocodefiles!!

        _Inlayrenameinnocodefiles = ImageVector.Builder(
            name = "Inlayrenameinnocodefiles",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 1f)
                lineTo(2f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 1f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(1f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Inlayrenameinnocodefiles!!
    }

private var _Inlayrenameinnocodefiles: ImageVector? = null

