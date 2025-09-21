package github.xcodebn.intellijiconscompose.ide.shadow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Top: ImageVector
    get() {
        if (_Top != null) return _Top!!

        _Top = ImageVector.Builder(
            name = "Top",
            defaultWidth = 4.0.dp,
            defaultHeight = 6.0.dp,
            viewportWidth = 4.0f,
            viewportHeight = 6.0f
        ).apply {

        }.build()

        return _Top!!
    }

private var _Top: ImageVector? = null

