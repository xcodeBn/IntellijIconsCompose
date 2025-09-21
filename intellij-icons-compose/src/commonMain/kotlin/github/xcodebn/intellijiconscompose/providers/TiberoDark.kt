package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TiberoDark: ImageVector
    get() {
        if (_TiberoDark != null) return _TiberoDark!!

        _TiberoDark = ImageVector.Builder(
            name = "TiberoDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF4387FB))
            ) {
                moveTo(15f, 2f)
                horizontalLineTo(1f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                lineTo(10f, 14f)
                verticalLineTo(4f)
                lineTo(15f, 4f)
                verticalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFA4347))
            ) {
                moveTo(1f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(1f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _TiberoDark!!
    }

private var _TiberoDark: ImageVector? = null

