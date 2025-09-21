package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inlayrenameincommentsactive: ImageVector
    get() {
        if (_Inlayrenameincommentsactive != null) return _Inlayrenameincommentsactive!!

        _Inlayrenameincommentsactive = ImageVector.Builder(
            name = "Inlayrenameincommentsactive",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(8f, 2f)
                horizontalLineTo(6f)
                lineTo(0f, 10f)
                horizontalLineTo(2f)
                lineTo(8f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(12f, 2f)
                horizontalLineTo(10f)
                lineTo(4f, 10f)
                horizontalLineTo(6f)
                lineTo(12f, 2f)
                close()
            }
        }.build()

        return _Inlayrenameincommentsactive!!
    }

private var _Inlayrenameincommentsactive: ImageVector? = null

