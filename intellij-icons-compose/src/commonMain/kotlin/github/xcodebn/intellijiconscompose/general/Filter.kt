package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Filter: ImageVector
    get() {
        if (_Filter != null) return _Filter!!

        _Filter = ImageVector.Builder(
            name = "Filter",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
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

        return _Filter!!
    }

private var _Filter: ImageVector? = null

