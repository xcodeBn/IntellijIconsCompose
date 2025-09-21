package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ActivefilterDark: ImageVector
    get() {
        if (_ActivefilterDark != null) return _ActivefilterDark!!

        _ActivefilterDark = ImageVector.Builder(
            name = "ActivefilterDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3592C4))
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 3f)
                lineTo(10f, 8f)
                lineTo(6f, 8f)
                lineTo(2f, 3f)
                close()
            }
        }.build()

        return _ActivefilterDark!!
    }

private var _ActivefilterDark: ImageVector? = null

