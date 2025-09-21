package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InlayrenameinnocodefilesactiveDark: ImageVector
    get() {
        if (_InlayrenameinnocodefilesactiveDark != null) return _InlayrenameinnocodefilesactiveDark!!

        _InlayrenameinnocodefilesactiveDark = ImageVector.Builder(
            name = "InlayrenameinnocodefilesactiveDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 1f)
                lineTo(2f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0)),
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

        return _InlayrenameinnocodefilesactiveDark!!
    }

private var _InlayrenameinnocodefilesactiveDark: ImageVector? = null

