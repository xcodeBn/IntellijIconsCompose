package github.xcodebn.intellijiconscompose.plugins

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Disabled: ImageVector
    get() {
        if (_Disabled != null) return _Disabled!!

        _Disabled = ImageVector.Builder(
            name = "Disabled",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(3f, 6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF))
                ) {
                    moveTo(3f, 6f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(3f)
                    close()
                }
            }
        }.build()

        return _Disabled!!
    }

private var _Disabled: ImageVector? = null

