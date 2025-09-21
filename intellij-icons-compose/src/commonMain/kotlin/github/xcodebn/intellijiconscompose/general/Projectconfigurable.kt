package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Projectconfigurable: ImageVector
    get() {
        if (_Projectconfigurable != null) return _Projectconfigurable!!

        _Projectconfigurable = ImageVector.Builder(
            name = "Projectconfigurable",
            defaultWidth = 9.0.dp,
            defaultHeight = 9.0.dp,
            viewportWidth = 9.0f,
            viewportHeight = 9.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(9f, 0f)
                lineTo(9f, 8f)
                lineTo(0f, 8f)
                lineTo(0f, 0f)
                close()
                moveTo(1f, 2f)
                lineTo(1f, 7f)
                lineTo(8f, 7f)
                lineTo(8f, 2f)
                lineTo(1f, 2f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(0f, 0f)
                    lineTo(9f, 0f)
                    lineTo(9f, 8f)
                    lineTo(0f, 8f)
                    lineTo(0f, 0f)
                    close()
                    moveTo(1f, 2f)
                    lineTo(1f, 7f)
                    lineTo(8f, 7f)
                    lineTo(8f, 2f)
                    lineTo(1f, 2f)
                    close()
                }
            }
        }.build()

        return _Projectconfigurable!!
    }

private var _Projectconfigurable: ImageVector? = null

